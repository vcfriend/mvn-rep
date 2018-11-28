<template>
	<div class="components_HeaderBox">
		<el-menu
			:default-active="$route.path"
			class="el-menu-demo"
			mode="horizontal"
			@select="handleSelect"
			background-color="#4b4b4b"
			text-color="#fff"
			active-text-color="#ffd04b">
			<el-menu-item key="1" index="/myPlayer">视频测试</el-menu-item>
		
		</el-menu>
	</div>

</template>
<script>
  export default {
    data () {
      return {
        activeIndex: '1'
      }
    },
    computed: {},
    mounted () {

    },
    methods: {
      handleSelect (key, keyPath) {
        this.$router.push(key)
        // console.log(key)
      },
      // 返回首页
      backHome () {
        window.open('http://47.101.132.62:8490/')
      }
    }
  }
</script>

<style scoped>
	/*@import "./../../assets/icon/iconfont.css";*/
	/*@import "./../../assets/icon/font_838244_7b3ne3z5nop/iconfont.css";*/
	
	.components_HeaderBox .el-menu {
		box-sizing: border-box;
		padding: 0 100px;
	}
	
	.el-menu--horizontal {
		border: none !important;
	}

</style>
