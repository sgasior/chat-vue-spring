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
            <input type="text" placeholder="Nick name" v-model="user.nick"/>
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
        user: {
          nick: '',
          color: null
        },
        hasErrorInUserName: false
      }
    },
    methods: {
      enterChat() {
        if (this.user.nick && this.user.nick.trim().length > 0) {
          this.user.color = this.getRandomColor();
          this.$router.push({
            name: 'Chat',
            params: {user: this.user}
          })
        } else {
          this.hasErrorInUserName = true;
        }
      },
      getRandomColor() {
        let availableColors = [
          '#fe9801',
          '#ccda46',
          '#f5cdaa',
          '#fe9801',
          '#4f98ca',
          '#f67280',
          '#d6e5fa',
          '#a35638',
          '#eea5f6',
          '#76dbd1',
        ];
        return availableColors[Math.floor(Math.random() * availableColors.length)];
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

  .welcome .login-button:hover {
    background-image: linear-gradient(60deg, #29323c 0%, #485563 100%);
    color: #fff;
  }

  .form .icon {
    color: #fff !important;
  }
</style>
