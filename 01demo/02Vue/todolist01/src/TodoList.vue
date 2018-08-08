<template>
  <div id="app">
    <div>
      <input v-model="inpuValue"/>
      <button @click="handleSubmit">提交</button>
    </div>
    <ul>
      <todo-item v-for="(item, index) in list"
      :content = "item"
      :key =  "index"
      :abc = "index"
      :index = "index"
      @delete = "handleDelete"
      >
      </todo-item>
    </ul>
  </div>
</template>

<script>
import TodoItem from './components/TodoItem'
export default {
  components: {
    'todo-item': TodoItem
  },
  data () {
    return {
      inpuValue: '',
      list: []
    }
  },
  methods: {
    handleSubmit () {
      this.list.push(this.inpuValue)
    },
    handleDelete (index) {
      this.list.splice(index, 1)
    }
  }
}

</script>

<style>

</style>
