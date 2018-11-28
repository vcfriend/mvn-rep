<template>
    <div class="wrapper">
          <el-container style="height: 100%;">
            <el-container>
                <el-header >
                    <v-head></v-head>
                </el-header>
                <el-main style="height: 100%;">
                    <div class="content">
                        <!--<transition name="move" mode="out-in">-->
                            <router-view></router-view>
                        <!--</transition>-->
                    </div>
                </el-main>
            </el-container>
        </el-container>
    </div>
</template>

<script>
import vHead from './Header.vue'

export default {
  components: {
    vHead
  }
}
</script>
<style>
    .el-main{
        padding: 0px;
    }
    .el-header{
        padding: 0px;
    }
</style>
