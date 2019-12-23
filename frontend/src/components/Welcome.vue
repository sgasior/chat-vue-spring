<template>
  <div class="welcome">
    <div class="ui raised very padded text container segment">
      <h2 class="ui center aligned icon header">
        <i class="circular user icon"></i>
        Welcome to Chat app
      </h2>
      <form class="ui fluid form">
        <div class="field">
          <div class="ui input focus">
            <input type="text" placeholder="Nick name" v-model="userName"/>
          </div>
          <!--red basic-->
          <div class="ui pointing label" v-bind:class="hasErrorInUserName ? 'red' : ''">Please enter your nick</div>
        </div>
        <div class="ui animated button login-button fluid" tabindex="0" @click="enterChat">
          <div class="visible content">Start chating</div>
          <div class="hidden content">
            <i class="right arrow icon"></i>
          </div>
        </div>
      </form>
    </div>
  </div>
</template>

<script>
  export default {
    name: 'Welcome',
    data() {
      return {
        userName: '',
        hasErrorInUserName: false
      }
    },
    methods: {
      enterChat() {
        if (this.userName || this.userName.trim().length > 0) {
          this.$router.push({
            name: 'Chat',
            params: {userName: this.userName}
          })
        } else {
          this.hasErrorInUserName = true;
        }
      }
    }
  }
</script>

<style>
  body {
    background-image: linear-gradient(to right, #fa709a 0%, #fee140 100%);
  }

  .welcome {
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
  }

  .header .icon {
    background-image: linear-gradient(60deg, #29323c 0%, #485563 100%);
    -webkit-background-clip: text;
    -webkit-text-fill-color: transparent;
  }

  .welcome .login-button {
    margin-top: 2rem;
    color: #fff;
    width: 16rem;
    background-image: linear-gradient(60deg, #29323c 0%, #485563 100%);
  }

  .welcome .login-button:hover{
    background-image: linear-gradient(60deg, #29323c 0%, #485563 100%);
    color: #fff;
  }

  .form .icon  {
    color: #fff !important;
  }
</style>
