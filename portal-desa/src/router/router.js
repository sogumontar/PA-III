import Vue from 'vue';
import Router from 'vue-router';
import Pages from "./pages";
Vue.use(Router);
export default new Router({
    mode: 'history',
    base: process.env.BASE_URL,
//     routes: [{
//         path: '/login',
//         name: 'login',
//         component: Login,
//     }, {
//         path: '/',
//         name: 'home',
//         component: Home,
//     }, ],
// });

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
    ]
} );
