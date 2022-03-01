<template>
  <a-layout>
<!--因为有很多页面都要用到header和footer，所以可以考虑将这两个部分做成公共的组件放到component里去-->
    <The-header/>
      <router-view/>
    <a-layout-footer style="text-align: center">
      Ant Design ©2021 Created by Wug
    </a-layout-footer>
  </a-layout>
</template>
<script lang="ts">
import { defineComponent } from 'vue';
import TheHeader from '@/components/The-header.vue';    // 引入组件:1、引入

export default defineComponent({
  name: 'app',
  components:{
    TheHeader,  // 2、添加组件
  }
});
</script>
<style>
#components-layout-demo-top-side-2 .logo {
  float: left;
  width: 120px;
  height: 31px;
  margin: 16px 24px 16px 0;
  background: rgba(255, 255, 255, 0.3);
}

.ant-row-rtl #components-layout-demo-top-side-2 .logo {
  float: right;
  margin: 16px 0 16px 24px;
}

.site-layout-background {
  background: #fff;
}
</style>
