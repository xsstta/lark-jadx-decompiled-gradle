;function getMetaTitle() {
  const titleEle = [].slice.call(document.head.getElementsByTagName('title'))[0];
  return (titleEle && titleEle.innerText) || '';
}

function getMetaDesc() {
  const descEle = [].slice.call(document.head.getElementsByTagName('meta')).find((a) => a.getAttribute('name') === 'description');
  return (descEle && descEle.getAttribute('content')) || '';
}

function getMetaIcon() {
  let iconEle = [].slice.call(document.head.getElementsByTagName('link')).find((a) => (a.rel || '').indexOf("icon") !== -1);
  return (iconEle && iconEle.href) || '';
}

function getOGPInfo(prop) {
  const ogEle = [].slice.call(document.head.getElementsByTagName('meta')).find((a)=>a.getAttribute('property') === `og:${prop}`);
  return (ogEle && ogEle.getAttribute('content')) || '';
}

//对齐主端的img解析方案
function getImg() {
  var min_image_size=100;
  var imgs=document.querySelectorAll('body img');
  var icon = '';
  for (var i = 0; i<imgs.length;i++) {
      var img = imgs[i];
      if (img.naturalWidth>min_image_size&&img.naturalHeight>min_image_size) {
          icon=img.src;
          return icon;
      }
  }
  return icon;
}


function getH5Info() {
  const title = getOGPInfo('title') || getMetaTitle() || '';
  const desc = getOGPInfo('description') || getMetaDesc() || '';
  const iconUrl = getImg() || '';
  return {
    iconUrl,
    title: title.replace(/[\r\n\t]/g, ''),
    desc: desc.replace(/\r\n/g, ''),
  }
}

getH5Info();
