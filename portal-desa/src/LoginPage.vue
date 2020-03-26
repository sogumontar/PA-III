<template>
    <html>
        <div >
            <b-navbar id="navb" toggleable="lg" type="dark" >
                <b-navbar-brand href="#"><img alt="Vue logo" src="./assets/log.png" width="30px" ></b-navbar-brand>

                <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>

                <b-collapse id="nav-collapse" is-nav>
                    <b-nav-form>
                        <b-form-input size="sm" class="mr-sm-2" placeholder="Search"></b-form-input>
                        <b-button size="sm" class="my-2 my-sm-0" type="submit">Search</b-button>
                    </b-nav-form>

                    <b-navbar-nav class="ml-auto">
                        <b-navbar-nav>
                            <b-nav-item href="#">Produk</b-nav-item>
                            <b-nav-item href="#" >Desa</b-nav-item>
                        </b-navbar-nav>
                        <img alt="Vue logo" src="./assets/profile.png" width="45px" height="45px" >
                        <b-nav-item-dropdown  right>
                            <b-dropdown-item href="#">Profile</b-dropdown-item>
                            <b-dropdown-item href="#">Keranjang</b-dropdown-item>
                            <b-dropdown-item href="#">Pesanan</b-dropdown-item>
                            <b-dropdown-item href="#">Logout</b-dropdown-item>
                        </b-nav-item-dropdown>

                        <b-navbar-brand href="#" ></b-navbar-brand>

                    </b-navbar-nav>
                </b-collapse>
            </b-navbar>
        </div>

    </html>

</template>

<script>
    export default {
        name: "LoginPage"
    }
</script>

<style scoped>
    #navb{
        background-color: #ACE7EF;
    }
</style>