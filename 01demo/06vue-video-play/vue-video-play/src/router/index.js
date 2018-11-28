import Vue from 'vue'
import Router from 'vue-router'
import MyPlayer from '../components/page/demo/myPlayer.vue'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      component: resolve => require(['../components/common/Home.vue'], resolve),
      meta: {requireAuth: true, CName: '首页'},
      children: [
        {
          path: '/',
          meta: {requireAuth: true, CName: '视频播放'},
          component: MyPlayer
        },
        {
          path: '/myPlayer',
          name: 'myPlayer',
          meta: {requireAuth: true, CName: '视频播放'},
          component: MyPlayer
        }
      ]
    }
  ]
})
