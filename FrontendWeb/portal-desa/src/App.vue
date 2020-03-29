<template>
  <html>
    <div >
      <b-navbar id="navb" toggleable="lg" type="dark" >
        <b-navbar-brand href="#"><img alt="Vue logo" src="./assets/pict/logo.png" width="30px" ></b-navbar-brand>

        <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>

        <b-collapse id="nav-collapse" is-nav>
          <b-nav-form>
            <b-form-input size="sm" class="mr-sm-2" placeholder="Search"></b-form-input>
            <b-button size="sm" class="my-2 my-sm-0" type="submit">Search</b-button>
          </b-nav-form>

          <b-navbar-nav class="ml-auto">
            <b-navbar-nav>
              <b-nav-item href="/desa">Produk</b-nav-item>
              <b-nav-item href="/produk" >Desa</b-nav-item>
            </b-navbar-nav>
            <img alt="Vue logo" src="./assets/pict/profile.png" width="45px" height="45px" >
            <b-nav-item-dropdown  right>
              <b-dropdown-item href="/">Profile</b-dropdown-item>
              <b-dropdown-item href="/about">Keranjang</b-dropdown-item>
              <b-dropdown-item href="/">Pesanan</b-dropdown-item>
              <b-dropdown-item href="/login">Login</b-dropdown-item>
            </b-nav-item-dropdown>

            <b-navbar-brand href="#" ></b-navbar-brand>

          </b-navbar-nav>
        </b-collapse>
      </b-navbar>
    </div>

    <router-view />
  </html>
</template>

<style>
  #navb{
    background-color: #ACE7EF;
  }
</style>
