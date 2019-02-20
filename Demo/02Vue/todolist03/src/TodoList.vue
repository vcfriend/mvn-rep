<template>
  <div id="app">
    <input v-model="inputValue" type="text" name=""/>
    <button @click="handleSubmit">提交</button>
    <ul>
      <todo-item v-for="(item, index) in list"
      :content = "item"
      :key = "index"
      :abc = "index"
      :index = "index"
      @delete = "handleDelete"
      ></todo-item>
    </ul>
  </div>
</template>

<script>
import TodoItem from './components/TodoItem'
export default {
  name: 'TodoList',
  components: {
    'todo-item': TodoItem
  },
  data () {
    return {
      inputValue: '',
      list: []
    }
  },
  methods: {
    handleSubmit () {
      this.list.push(this.inputValue)
    },
    handleDelete (index) {
      this.list.splice(index, 1)
    }
  }
}
</script>

<style scoped="">

</style>
