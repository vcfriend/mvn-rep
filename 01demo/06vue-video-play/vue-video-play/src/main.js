// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import ElementUi from 'element-ui'
import VueRouter from 'vue-router'

// 引入video.js 视频播放
import VideoPlayer from 'vue-video-player'
window.videojs = require('video.js')
require('videojs-contrib-hls/dist/videojs-contrib-hls.js')

Vue.use(VideoPlayer)
Vue.use(VueRouter)
Vue.use(ElementUi)

Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: {App},
  template: '<App/>'
})
