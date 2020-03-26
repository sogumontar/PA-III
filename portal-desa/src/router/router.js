import Vue from 'vue';
import Router from 'vue-router';
import Pages from "./pages";
Vue.use(Router);
export default new Router({
    mode: 'history',
    base: process.env.BASE_URL,
<<<<<<< HEAD:portal-desa/src/router.js
    routes: [{
        path: '/login',
        name: 'login',
        component: Login,
    }, {
        path: '/',
        name: 'home',
        component: Home,
    }, ],
});
=======
    routes: [
        {
            path: '/login',
            name: 'login',
            component: Pages.LOGIN,
        },{
            path: '/',
            name: 'home',
            component: Pages.HOME,
        },
    ],
});
>>>>>>> d687eaa453843baac74a2f726107bb54374f7a28:portal-desa/src/router/router.js
