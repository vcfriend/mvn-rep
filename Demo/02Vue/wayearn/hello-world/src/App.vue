<template>
  <div id="app">
    <div id="nav">
      <router-link to="/">Login</router-link> |
      <!--<router-link to="/about">About</router-link>-->
    </div>
    <router-view/>
  </div>
</template>

<style lang="scss">
	$main-color: #42b983;
	* {
		margin: 0;
		padding: 0;
		box-sizing: border-box;
		-webkit-tap-highlight-color: rgba(0, 0, 0, 0);
		-webkit-tap-highlight-color: transparent;
	}
	
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
#nav {
	margin: 30px;
  padding: 0px;
  a {
    font-weight: bold;
    color: #2c3e50;
    &.router-link-exact-active {
      color: #42b983;
    }
  }
}
</style>
