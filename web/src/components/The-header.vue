<template>
  <div>
    <a-layout-header class="header">
      <div class="logo" />
      <a-menu
          theme="dark"
          mode="horizontal"
          v-model:selectedKeys="selectedKeys1"
          :style="{ lineHeight: '64px' }"
      >
        <a-menu-item key="1">nav 123</a-menu-item>
        <a-menu-item key="2">nav 2</a-menu-item>
        <a-menu-item key="3">nav 3</a-menu-item>
      </a-menu>
    </a-layout-header>
  </div>
</template>

<script lang="ts">
import { defineComponent } from 'vue';

export default defineComponent({
  name: 'The-header',  // 给这个组件起的名字，就是用的时候的名字<The-header/>
  // props: {
  //   // 用于父子组件之间传递数据
  //   msg: String,
  // },
});
</script>

<style scoped>

</style>
