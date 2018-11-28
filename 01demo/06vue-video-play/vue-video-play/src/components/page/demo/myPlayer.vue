<template>
	<div>
		<h2>视频播放测试</h2>
		<div class="player-container">
			<video-player class="video-player vjs-custom-skin" :options="playerOptions"></video-player>
		</div>
	</div>
</template>

<script>

  // window.videojs = require('video.js')
  // require('videojs-contrib-hls/dist/videojs-contrib-hls')
  
  //
  // 引入video样式
  import 'video.js/dist/video-js.css'
  import 'vue-video-player/src/custom-theme.css'
  

  export default {
    name: 'myPlayer',
    data () {
      return {
        playerOptions: {
          playbackRates: [0.7, 1.0, 1.5, 2.0], // 播放速度
          autoplay: false, // 如果true,浏览器准备好时开始回放。
          controls: true, // 控制条
          preload: 'auto', // 视频预加载
          muted: false, // 默认情况下将会消除任何音频。
          loop: false, // 导致视频一结束就重新开始。
          language: 'zh-CN',
          aspectRatio: '16:9', // 将播放器置于流畅模式，并在计算播放器的动态大小时使用该值。值应该代表一个比例 - 用冒号分隔的两个数字（例如"16:9"或"4:3"）
          fluid: true, // 当true时，Video.js player将拥有流体大小。换句话说，它将按比例缩放以适应其容器。
          sources: [{
            type: 'application/x-mpegURL',
            //						type: 'video/mp4',
            src: 'http://101.132.123.23:8881/media/singleVideo.m3u8?ts=slice%2F924%2F2018_10_23_10_19_30%2F294_924_5.ts%3FExpires%3D1543286641%26OSSAccessKeyId%3DLTAIWshnEfiYqcgw%26Signature%3DsvyRuf5d5QrKOusC0BdYr5s0pQM%253D'
            //						src: 'https://video-dev.github.io/streams/x36xhzz/x36xhzz.m3u8'
            //						src: 'http://amaitest.oss-cn-hangzhou.aliyuncs.com/record/live123/4001481793159.m3u8'
            //						src: 'http://playertest.longtailvideo.com/adaptive/bipbop/gear4/prog_index.m3u8'
            //						src: 'http://zhouchang.oss-cn-hangzhou.aliyuncs.com/crazyVideo/quzhouwenming/14DB6C58_1539816777_1_h264.mp4'
          }],
          poster: 'http://static.smartisanos.cn/pr/img/video/video_03_cc87ce5bdb.jpg', // 你的封面地址
          width: document.documentElement.clientWidth,
          notSupportedMessage: '此视频暂无法播放，请稍后再试' // 允许覆盖Video.js无法播放媒体源时显示的默认信息。
        }
      }
    },
    methods: {},
    computed: {}
  }
</script>

<style scoped>
	.player-container {
		width: 50%;
		height: 50%;
		padding: 50px 5%;
		color: #fff;
		-webkit-box-sizing: border-box;
		-moz-box-sizing: border-box;
		box-sizing: border-box;
		color: #fff;
	}
</style>
