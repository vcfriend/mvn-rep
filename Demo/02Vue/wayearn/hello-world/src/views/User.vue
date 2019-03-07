<template>
	<div>
		<p>user欢迎来到个人中心</p>
		<div class="ctrls">
			<router-link :to="{name: 'add'}" class="add">添加</router-link>
		</div>
	</div>
</template>

<script>
	export default {
		name: 'User',
	};
</script>

<style scoped>

</style>
