<template>
  <div id="06app">
    <ul>
      <li class="animate">对照组</li>
      <li v-for="(item, key, index) in items" class="animate" v-bind:key="item.id">{{item.id}}</li>
      <!-- 当前绑定值为item.id  -->
    </ul>
  </div>
</template>

<script>
export default {

  data: {
    items: [
        {
            id: 2,
        },
        {
            id: 1,
        },
        {
            id: 3,
        },
        {
            id: 4,
        },
    ]
  }
}

</script>

<style scoped>

</style>
