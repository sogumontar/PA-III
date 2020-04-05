import Vue from "vue";
import VueRouter from "vue-router";
import JhomePage from "../views/JhomePage.vue";
import DesaPage from "../views/DesaPage";
import ProductPage from "../views/ProductPage";
import Login from "../views/Login";

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "Home",
    component: JhomePage
  },
  {
    path: "/login",
    name: "Login",
    component: Login
  },
  {
    path: "/produk",
    name: "ProductPage",
    component: ProductPage
  },
  {
    path: "/desa",
    name: "DesaPage",
    component: DesaPage
  },
  {
    path: "/about",
    name: "About",
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () =>
      import(/* webpackChunkName: "about" */ "../views/About.vue")
  }
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes
});

export default router;
