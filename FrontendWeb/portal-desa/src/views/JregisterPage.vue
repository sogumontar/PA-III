<template>
    <b-container>

        <b-row class="justify-content-sm-center">
            <b-col col md="auto" sm="auto">
                <p id="logo"><b-icon-people-circle></b-icon-people-circle></p>
            </b-col>
        </b-row>

        <ul>
        <li v-for="error in form.errors" v-bind:key="error">{{ error }}</li>
        </ul>


        <b-form @submit="onSubmit" class="mt-3">

            <b-form-row class="justify-content-sm-center">
                <b-col cols="auto" col md="auto" lg="1" class="mt-2">
                    <p>Nama</p>
                </b-col>
                <b-col cols="auto" col md="auto" lg="auto" sm="auto" class="mt-2">
                    <p>:</p>
                </b-col>
                <b-col cols="8"  col md="5" lg="4" sm="7">
                    <b-form-input
                            id="input-nama"
                            v-model="form.nama"
                            required
                            type="text"
                    ></b-form-input>
                </b-col>
            </b-form-row>

            <b-form-row class="justify-content-sm-center mt-3">
                <b-col cols="auto" col md="auto" lg="1" class="mt-2">
                    <p>Alamat</p>
                </b-col>
                <b-col cols="auto" col md="auto" lg="auto" sm="auto" class="mt-2">
                    <p>:</p>
                </b-col>
                <b-col cols="8" col md="5" lg="4" sm="7" >
                    <b-textarea
                            id="input-alamat"
                            v-model="form.alamat"
                            required
                            rows="4"
                    ></b-textarea>
                </b-col>
            </b-form-row>

            <b-form-row class="justify-content-sm-center mt-3">
                <b-col cols="auto" col md="auto" lg="1" class="mt-2">
                    <p>Email</p>
                </b-col>
                <b-col cols="auto" col md="auto" lg="auto" sm="auto" class="mt-2">
                    <p>:</p>
                </b-col>
                <b-col cols="8"  col md="5" lg="4" sm="7">
                    <b-form-input
                            id="input-email"
                            v-model="form.email"
                            required
                            type="email"
                    ></b-form-input>
                </b-col>
            </b-form-row>

            <b-form-row class="justify-content-sm-center mt-3">
                <b-col cols="auto" col md="auto" lg="1" class="mt-2">
                    <p>Password</p>
                </b-col>
                <b-col cols="auto" col md="auto" lg="auto" sm="auto" class="mt-2">
                    <p>:</p>
                </b-col>
                <b-col cols="8"  col md="5" lg="4" sm="7">
                    <b-form-input
                            id="input-password"
                            v-model="form.password"
                            required
                            type="password"
                            name="password"
                    ></b-form-input>
                </b-col>
            </b-form-row>

            <b-form-row class="justify-content-sm-center mt-3">
                <b-col cols="auto" col md="auto" lg="1" class="mt-2">
                    <p>Ulang Password</p>
                </b-col>
                <b-col cols="auto" col md="auto" lg="auto" sm="auto" class="mt-2">
                    <p>:</p>
                </b-col>
                <b-col cols="8"  col md="5" lg="4" sm="7">
                    <b-form-input
                            id="input-ulang-password"
                            v-model="form.repassword"
                            required
                            type="password"
                            name="ulang-password"
                    ></b-form-input>
                </b-col>
            </b-form-row>
            <b-form-row class="justify-content-md-center">
                <b-col col md="4" lg="2">

                </b-col>
                <b-col col md="auto" lg="auto" >

                </b-col>
                <b-col col md="auto" lg="auto" class="mt-2">
                    <b-button type="submit" variant="primary" id="tombol-daftar" class="pl-3 pr-3">Daftar</b-button>
                </b-col>
            </b-form-row>
        </b-form>
    </b-container>
</template>

<script>
    export default {
        name: "JregisterPage",
        data(){
            return {
                form: {
                    nama: '',
                    alamat: '',
                    email: '',
                    password: '',
                    repassword: '',
                }
            }
        },
        methods: {
            onSubmit(){
                alert(JSON.stringify(this.form))
            },
        },
        computed: {
            cekSama(){
                if(this.passwordsFilled()){
                    return true
                }else{
                    return false
                }
            },
            passwordsFilled(){
                return (this.password !== '' && this.repassword !== '')
            }
        }
    }
</script>

<style scoped>
    #tombol-masuk{
        border-radius: 10px;
    }
    #logo{
        font-size: 7em;
        margin-top: 40px;
        text-align: center
    }
    #input-email, #input-password, #input-alamat, #input-nama, #input-ulang-password{
        border-radius: 10px;
    }


    @media only screen and (max-width: 600px) {
        #tombol-daftar{
            margin-left: 2px;
        }
        #font-register{
            font-size: 0.9em;
            margin-left: 0px;
        }
    }

    /* Small devices (portrait tablets and large phones, 600px and up) */
    @media only screen and (min-width: 600px) {
        #tombol-daftar{
            margin-left: 20px;
        }
        #font-register{
            font-size: 0.9em;
            margin-left: 70px;
        }
    }

    /* Medium devices (landscape tablets, 768px and up) */
    @media only screen and (min-width: 768px) {
        #tombol-daftar{
            margin-left: 50px;
        }
        #font-register{
            font-size: 0.9em;
            margin-left: 10px;
        }
    }

    /* Large devices (laptops/desktops, 992px and up) */
    @media only screen and (min-width: 992px) {
        #tombol-daftar{
            margin-left: 140px;
        }
        #font-register{
            font-size: 0.9em;
            margin-left: 40px;
        }
    }

    /* Extra large devices (large laptops and desktops, 1200px and up) */
    @media only screen and (min-width: 1200px) {
        #tombol-daftar{
            margin-left: 190px;
        }
        #font-register{
            margin-left: 100px;
            font-size: 0.9em;
        }
    }

</style>