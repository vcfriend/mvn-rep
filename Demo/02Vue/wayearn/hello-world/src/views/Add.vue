<template>
	<div>
		<div class="form-group">
			<div class="form-item">
				<div class="form-title">标题</div>
				<input class="form-input" type="text" v-model="title"/>
			</div>
			<div class="form-item">
				<div class="form-title">内容</div>
				<input class="form-input" type="text" v-model="content"/>
			</div>
		</div>
		<div class="bnts">
			<button type="button" @click="add()">添加</button>
			<button type="button" @click="()=> {this.$router.back()}"></button>
		</div>
		
	</div>
</template>

<script>
import store from '@/store';

export default {
  name: 'Add',
	store,
	data() {
  	return {
  		title: '',
		  content: '',
		};
	},
	methods: {
  	add() {
  	  store.commit('addItem', {
  	  	title: this.title,
				content: this.content,
	    });
			this.title = '';
			this.content = '';
			this.$router.push('/home/list');
	  },
	},
};
</script>

<style scoped lang="scss">
	.form-group {
		padding: 10px;
		.form-item {
			padding-bottom: 15px;
			.form-title {
				padding: 8px 0;
			}
			.form-input {
				border: 1px solid #dcdcdc;
				border-radius: 6px;
				width: 100%;
				line-height: 18px;
				outline: none;
				padding: 10px
			}
		}
	}
</style>
