var Platform = {
  iOS: 1,
  Android: 2,
  unsupported: 99,
}

function getPlatform() {
  var ua = navigator.userAgent;
  if (ua.indexOf('Android') > -1 || ua.indexOf('Adr') > -1) {
    return Platform.Android
  } else if (!!ua.match(/\(i[^;]+;( U;)? CPU.+Mac OS X/) || ua.indexOf('Mac OS X') > -1 || ua.indexOf('AppleWebKit') > -1)   {
    return Platform.iOS
  } else {
    return Platform.unsupported
  }
}

const currentPlatform = getPlatform();

function isIOS() {
  return currentPlatform == Platform.iOS;
}

function isAndroid() {
  return currentPlatform == Platform.Android;
}
function CommandService() {
}
CommandService.prototype.call = function(name) {
}
function signatureDomReady() {
  var param = {
  method: 'signatureDomReady',
  args: {}
  }
  invokeMethod(param)
}
function signatureItemClick(signatureId, isForce) {
  var param = {
  method: 'signatureItemClick',
  args: {
      signatureId,
      isForce
    }
  }
  invokeMethod(param)
}
function invokeMethod(param)
{
  if (isIOS()) {
    if(param.method != 'log') {
      console.log('invokeMethod ios:'+param.method);
    }
    window.webkit.messageHandlers.invoke.postMessage(param);
  } else if (isAndroid()) {
    if(param.method != 'log') {
      console.log('invokeMethod android:'+param.method);
    }
    var json = JSON.stringify(param);
    window.signatureList.prompt(json);
  }
}
function _(selector) {
  return document.querySelector(selector);
}

function __(selector) {
  return document.querySelectorAll(selector);
}

if (document.readyState != 'loading') {
  console.log("document.readyState != loading");
  init();
} else {
  window.addEventListener("DOMContentLoaded", function () {
    setTimeout(function () {
        console.log("DOMContentLoaded");
        init();
    }, 1);
  });
}

function init() {
  console.log('document.readyState:' + document.readyState);
  initUI();
  signatureDomReady();
}
function initUI() {
  let messageNodes = __('.message-item');
  messageNodes.forEach (messageNode => {
    initMessageNode(messageNode, messageNodes);
  });
}
function initMessageNode(messageNode, messageItems) {
    try {
       if (messageNode) {
          messageNode.removeEventListener('click', handleSignatureClick);

          messageNode.addEventListener('click', handleSignatureClick);

          var images = messageNode.querySelectorAll("div.signature-content img");
          optimizeImage(images);
       }
    } catch (e) {
       console.log('initMessageNode error:' + e);
    }
}

function handleSignatureClick(e) {
  const target = e.target;
  const signatureItem = target.closest('.signature-item');
  if (signatureItem) {
    var signatureId = signatureItem.getAttribute('signature-id') || "";
    var isForce = signatureItem.hasAttribute('disabled') || false;
    signatureItemClick(signatureId, isForce);
  }
}

// ---------- process image start ---------
window.loadImgSuccess = function (param) {
  var src = param["src"];
  console.log("loadImgSuccess:" + src);

  var images = __("div.signature-content img");
  for (var i = 0; i < images.length; i++) {
    console.log("loadImgSuccess loading :" + images[i].getAttribute("loading"));
    if (images[i].src == src || images[i].getAttribute("loading") == src) {
        console.log("loadImgSuccess call onImgLoad");
        images[i].removeAttribute("loading");

        images[i].onImgLoad();
    }
  }
};
var imagesSet = new Set();

function optimizeImage(images) {
console.log('optimizeImage:' + images);
  if (images) {
    for (var i = 0; i < images.length; i++) {
          var src = images[i].src;
          console.log('images[i].src:' + src);
          var result = getCidSrc(src);
          var isDownloadProxy = false;
          if(result != null && result.length > 0 && result.startsWith("cid")) {
              isDownloadProxy = true;
              src = result;
          }
          console.log('_getCidSrc:' + result);
          if (src.length > 0) {
              setImgLoading(images[i], src, isDownloadProxy);
          }
      }
  }
}

function getCidSrc(src) {
  if (/file.*?blank\.png\?cid=/.test(src)) {
    var cid = src.split("blank.png?cid=")[1];
    return "cid:"+cid;
  }
  return "";
}

function setImgLoading(originImg, src, isDownloadProxy) {
  if (!originImg.getAttribute('loading')) {
    console.log("_setImgLoading loading");
    imagesSet.add(originImg);
    originImg.setAttribute('loading', src);
    originImg.src = './images/blank.png';
    setImgMaxWidth(originImg);

    (function (originImg) {
      var image = new Image();
      setTimeout(function() {
          if (!image.loaded) {
            showCidImgPlaceholder(originImg, false);
          }
      }, 50);
      image.onload = originImg.onImgLoad = function (originImg) {
          return function () {
              image.loaded = true;
              adjustImgPlaceholder(image, originImg, src, false);
          };
      }(originImg);

      image.onerror = function (originImg) {
          return function () {
              if (!isDownloadProxy) {
                  image.loaded = true;
                  adjustImgPlaceholder(image, originImg, src, true);
              }
          };
      }(originImg);

      setTimeout(function (originImg) {
          return function () {
              if (!image.loaded) {
                  image.loaded = false;
                  adjustImgPlaceholder(image, originImg, src, true);
              }
          };
      }(originImg), 8000);

      // 触发图片下载
      image.src = src;
    })(originImg);
  }
}

function adjustImgPlaceholder(img, originImg, src, isError) {
  img.onload = img.onerror = function () {};
  originImg.loaded = img.loaded;

  if (isError) {
    // show error icon
    showCidImgPlaceholder(originImg, true);
  } else {
    // remove loading
    originImg.onImgLoad = function () {};
    showDomElement(originImg);
    originImg.src = src;
    originImg.style.height = 'auto';
    originImg.style.maxHeight = "none";
    setImgMaxWidth(originImg);

    let loadingContainer = originImg.parentNode;
    if (loadingContainer.classList.contains('loading_container')) {
      loadingContainer.parentNode.insertBefore(originImg, loadingContainer);
      loadingContainer.remove();
    }
  }
}

function setImgMaxWidth(img) {
  let imgStyle = getComputedStyle(img);
  var extraWidth = (parseFloat(imgStyle.marginLeft) || 0) + (parseFloat(imgStyle.marginRight) || 0);
  if (imgStyle.boxSizing == "content-box") {
    extraWidth = extraWidth + (parseFloat(imgStyle.paddingLeft) || 0) + (parseFloat(imgStyle.paddingRight) || 0);
    extraWidth = extraWidth + (parseFloat(imgStyle.borderLeftWidth) || 0) + (parseFloat(imgStyle.borderRightWidth) || 0);
  }
  if (extraWidth > 0) {
    img.style.maxWidth = `calc(100% - ${extraWidth}px)`;
  } else {
    img.style.maxWidth = "100%";
  }
}

function showCidImgPlaceholder(originImg, isError) {
  var loadingContainer;
  if (!originImg.parentNode.classList.contains('loading_container')) {
    let size = getImagePlaceHolderSize(originImg);
    var height = size.height;
    var width = size.width;
    if (height > 0 && width > 0) {
      loadingContainer = document.createElement('div');
      loadingContainer.style.width = `${width}px`;
      loadingContainer.style.height = `${height}px`;
      loadingContainer.classList.add('loading_container');
      loadingContainer.classList.add('withBackground');
      originImg.parentNode.insertBefore(loadingContainer, originImg);
      loadingContainer.append(originImg)
      hideDomElement(originImg);
    }
  } else {
    loadingContainer = originImg.parentNode;
  }

  if (loadingContainer) {
    var width = parseFloat(loadingContainer.style.width);
    var height = parseFloat(loadingContainer.style.height);
    let loading_svg = loadingContainer.querySelector('.loading_svg');
    if (loading_svg) {
      loading_svg.remove();
    }
    let error_svg = loadingContainer.querySelector('.error_svg');
    if (error_svg) {
      loadingContainer.classList.remove('show_error');
      error_svg.remove();
    }
    if (height >= 48 && width >= 48) {
      hideDomElement(originImg);
      if (!isError) {
        var loadingImg = convertToNodeFirstElementByStr(`<svg class="loading_svg" width="24" height="24" viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                                 <path d="M5.22051 5.1516C5.33192 5.0401 5.46421 4.95165 5.6098 4.89128C5.7554 4.83091 5.91146 4.79981 6.06908 4.79975C6.2267 4.79969 6.38278 4.83068 6.52842 4.89095C6.67407 4.95121 6.80641 5.03958 6.9179 5.15099C7.02939 5.2624 7.11785 5.39468 7.17822 5.54028C7.23859 5.68588 7.26969 5.84194 7.26975 5.99956C7.2698 6.15717 7.23882 6.31326 7.17855 6.4589C7.11829 6.60454 7.02992 6.73689 6.91851 6.84838C6.24533 7.52037 5.71161 8.31878 5.34803 9.19773C4.98444 10.0767 4.79816 11.0188 4.7999 11.97C4.7999 15.9642 8.02429 19.2 11.9999 19.2C15.9755 19.2 19.1999 15.9642 19.1999 11.97C19.1999 11.6517 19.3263 11.3465 19.5514 11.1215C19.7764 10.8964 20.0816 10.77 20.3999 10.77C20.7182 10.77 21.0234 10.8964 21.2484 11.1215C21.4735 11.3465 21.5999 11.6517 21.5999 11.97C21.5999 17.2878 17.3027 21.6 11.9999 21.6C6.6971 21.6 2.3999 17.2878 2.3999 11.97C2.3999 9.37799 3.4271 6.94618 5.22051 5.1516Z" fill="#bbbfc4"/></svg>`);
        loadingContainer.appendChild(loadingImg);
      } else {
        let realDataSize = getImageRealDataSize(originImg);
        let attributeSize = getImageAttributSize(originImg);
        let imgWidth = realDataSize.width || attributeSize.width || parseFloat(originImg.style.width);
        let imgHeight = realDataSize.height || attributeSize.height || parseFloat(originImg.style.height);
        if ((isNullOrNaN(imgWidth) && isNullOrNaN(imgHeight)) || imgWidth == 0 || imgHeight == 0) {
            if (loadingContainer.classList.contains('loading_container')) {
              loadingContainer.parentNode.insertBefore(originImg, loadingContainer);
              loadingContainer.remove();
            }
        } else {
          loadingContainer.classList.add('show_error');
          // Add error indicator
          let errorSvg = convertToNodeFirstElementByStr(`<svg class="error_svg" width="24" height="24" viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M20.87 2.05999C21.42 2.05999 21.87 2.50999 21.87 3.05999V8.64499L19.87 10.645V4.05999H3.86999V20.06H10.455L8.455 22.06H2.87C2.32 22.06 1.87 21.61 1.87 21.06V3.05999C1.87 2.50999 2.32 2.05999 2.87 2.05999H20.87ZM21.87 11.47V21.055C21.87 21.605 21.42 22.055 20.87 22.055H11.285L13.285 20.055H19.87V13.47L21.87 11.47ZM17.755 10.245C17.835 10.325 17.87 10.425 17.87 10.53V12.65L12.455 18.06H10.095C10.065 18.06 10.04 18.055 10.01 18.05L5.73 18.04C5.61 18.04 5.5 17.965 5.455 17.855C5.41 17.745 5.435 17.615 5.52 17.53L9.65499 13.395C9.81 13.24 10.065 13.24 10.22 13.395L12.125 15.3L17.18 10.245C17.345 10.08 17.6 10.08 17.755 10.245ZM17.87 15.47V17.755C17.87 17.92 17.735 18.055 17.57 18.055H15.28L17.87 15.47ZM8.87 6.05999V9.05999H5.87V6.05999H8.87Z" fill="#BBBFC4"/></svg>`);
          loadingContainer.appendChild(errorSvg);
        }
      }
    }
  }
}

function convertToNodeByStr(str) {
  const dom = document.createElement('div');
  dom.innerHTML = str;
  return dom;
}

function convertToNodeFirstElementByStr(str) {
  var dom = convertToNodeByStr(str);
  return dom.firstElementChild;
}

function isNull(checkingItem) {
  try {
    checkingItem.toString();
    return false;
  } catch (e) {
    return true;
  }
}

function isNullOrNaN(checkingItem) {
  return isNull(checkingItem) || isNaN(checkingItem)
}

function hideDomElement(element) {
  if (isNull(element)) {
      return;
  }
  if (element.classList.contains("display-none")) {
      return;
  }
  let curDisplay = element.style.display;
  if (!isNull(curDisplay) && curDisplay != "none") {
    element.setAttribute('lark-pre-display', curDisplay);
  }
  element.style.setProperty("display", "none", "important")
}

function showDomElement(element) {
  if (isNull(element)) {
    return;
  }

  var preDisplay = element.getAttribute('lark-pre-display') || "";
  element.style.setProperty("display", preDisplay);
  element.removeAttribute('lark-pre-display');

  while (element.classList.contains("display-none")) {
    element.classList.remove("display-none");
  }
}

function getImageRealDataSize(imgElement) {
  let dataWidth = imgElement.getAttribute('data-realwidth');
  let dataHeight = imgElement.getAttribute('data-realheight');
  return {"width": dataWidth, "height": dataHeight}
}

function getImageAttributSize(imgElement) {
  let attributeWidth = parseFloat(imgElement.getAttribute('width'))
  let attributeHeight = parseFloat(imgElement.getAttribute('height'))
  return {"width": attributeWidth, "height": attributeHeight}
}

function getImagePlaceHolderSize(imgElement) {
  let realDataSize = getImageRealDataSize(imgElement);
  var dataWidth = realDataSize.width;
  var dataHeight = realDataSize.height;
  let attributeSize = getImageAttributSize(imgElement);
  let attributeWidth = attributeSize.width;
  let attributeHeight = attributeSize.height;
  if (isNullOrNaN(dataWidth) || isNullOrNaN(dataHeight)) {
    dataWidth = 160;
    dataHeight = 160;
    if (isNullOrNaN(attributeHeight) || isNullOrNaN(attributeWidth)) {
      return {"width": dataWidth, "height": dataHeight}
    }
  }

  let containerWidth = getContentPageWidth();

  let width = parseInt(imgElement.style.width) || parseInt(imgElement.getAttribute('width'));
  let widthIsPercent = imgElement.style.width.indexOf("%") > -1;
  if (width && widthIsPercent) {
    width = containerWidth * width / 100;
  }
  let height = parseInt(imgElement.style.height) || parseInt(imgElement.getAttribute('height'));
  let heightIsPercent = imgElement.style.height.indexOf("%") > -1;

  if (isNullOrNaN(width)) {
    if (!isNullOrNaN(height) && !heightIsPercent) {
      width = (height / dataHeight) * dataWidth;
    } else {
      width = dataWidth;
      height = dataHeight;
    }
  } else if (isNullOrNaN(height) || heightIsPercent) {
    height = (width / dataWidth) * dataHeight;
  }
  if (containerWidth && width > containerWidth) {
    height = (containerWidth / width) * height;
    width = containerWidth;
  }
  return {
    width,
    height,
  };
}

// ---------- process image end ---------

// ---------- process signature template start -------
function tryParse(str) {
  try {
    return JSON.parse(str);
  } catch (error) {
    console.log("tryParse error:" + error)
    return null;
  }
}

window.evaluateSignatureTemplate = function(entSignatures) {
    let signatures = tryParse(entSignatures);
//    console.log("evaluateSignatureTemplate end:" + entSignatures)
    if (signatures) {
        let signMap = new Map();
        for (let i=0; i< signatures.length; i++) {
            let signItem = signatures[i];
            if (signItem) {
                let signId = signItem['id'] || "";
                let signTemplate = signItem['template'] || null;
                if (signId && signTemplate) {
                    signMap.set(signId, signTemplate);
                }
            }
//            console.log("evaluateSignatureTemplate:" + signatures[i])
        }
        var signatureNodes = __(".signature-item");
        for (var i = 0; i < signatureNodes.length; i++) {
            var signatureId = signatureNodes[i].getAttribute('signature-id') || "";
            if (signatureId) {
//            console.log("evaluateSignatureTemplate id:" + signatureId)
               let templateNodes = signatureNodes[i].querySelectorAll('[data-variable-meta-props]') || "";
               if (templateNodes) {
                  let signTemp = signMap.get(signatureId);
                  for (var t = 0; t < templateNodes.length; t++) {
                    let propsTemp = tryParse(templateNodes[t].getAttribute('data-variable-meta-props'));
//                    console.log("evaluateSignatureTemplate templateNodes:" + templateNodes[t].getAttribute('data-variable-meta-props'))
//                    console.log("evaluateSignatureTemplate propsTemp:" + signTemp + ", id:" + propsTemp['id'])
                    if (signTemp && propsTemp && propsTemp['id'] && signTemp[propsTemp['id']]) {
//                        console.log("evaluateSignatureTemplate propsTemp value:" + signTemp[propsTemp['id']] + ", innerHtml:" + templateNodes[t].innerText)
                        templateNodes[t].innerText = signTemp[propsTemp['id']];
                    } else {
//                        console.log("evaluateSignatureTemplate propsTemp empty")
                        templateNodes[t].innerText = "";
                    }
//                    console.log("evaluateSignatureTemplate templateNodes:" + templateNodes[t].getAttribute('data-variable-meta-props'))
                  }
//                  console.log("evaluateSignatureTemplate signMap:" + signatures[i])
               }
            }
        }
    }
}

// ---------- process signature template end ---------
