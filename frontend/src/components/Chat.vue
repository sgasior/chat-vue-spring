<template>
  <main>
    <div class="ui grid centered">
      <div class="eight wide computer fourteen wide phone column box2 chat-box">
        <div class="ui grey ribbon label">Welcome to chat {{user.nick}}</div>
        <div class="ui card">
          <div class="ui segments">
            <div class="ui segment" v-for="message in messages">
              <div class="ui horizontal label" :style="{backgroundColor:message.color}">{{message.nick}}</div>
              {{message.value}}
            </div>
          </div>
        </div>
        <div class="ui fluid action input">
          <input type="text" placeholder="Message..." v-model="message" @keydown.enter="sendMessage" ref="msg">
          <div class="ui button btn-pop"><i class="smile outline icon"></i></div>
          <div class="ui flowing popup transition hidden">
            <div class="faces">
              <div class="ui grid">
                <div class="three column row">
                  <div class="column" v-for="(lennyFace,index) in lennyFaces" :key="index">
                    <div class="face" @click="putIconIntoMessage(index)">{{lennyFace}}</div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </main>
</template>

<script>
  export default {
    name: 'Chat',
    props: ["user"],
    data() {
      return {
        lennyFaces: ['( ͡o ͜ʖ ͡o)', 'ಠ╭╮ಠ', '(▀̿Ĺ̯▀̿ ̿)',
          '¯\\_( ͡° ͜ʖ ͡°)_/¯', 'ᕦ( ͡° ͜ʖ ͡°)ᕤ', '¯\\_(ツ)_/¯',
          '( ͡° ͜ʖ ͡°)╭∩╮', '( ͡°( ͡° ͜ʖ( ͡° ͜ʖ ͡°)ʖ ͡°) ͡°)', '( ͡ʘ ͜ʖ ͡ʘ)'],
        messages: [
          {
            nick: 'John',
            value: 'Hello!',
            color: '#ccda46'
          },
          {
            nick: 'Syma',
            value: 'How are you?',
            color: '#a35638'
          },
        ],
        message: ''
      }
    },
    methods: {
      putIconIntoMessage(index) {
        let cursorPosition = this.$refs.msg.selectionStart;
        this.message = `${this.message.substring(0, cursorPosition)}${this.lennyFaces[index]}${this.message.substring(cursorPosition, this.message.length)}`;
      },
      sendMessage() {
        if (this.message.length > 0) {
          this.messages.push({
            nick: this.user.nick,
            value: this.message,
            color: this.user.color
          });
          this.message = '';
        }
      }
    },
    mounted() {
      $('.btn-pop')
        .popup({
          on: 'click',
          position: 'top right',
        })
      ;
    }
  }
</script>

<style>

  main {
    margin-top: 8rem;
  }

  .chat-box {
    height: 600px;
    border-radius: 10px;
    position: relative;
    background: #fff;
  }

  .chat-box .card {
    width: 100%;
    height: 80%;
    margin-top: 2rem;
    overflow: auto;
  }

  .chat-box::-webkit-scrollbar {
    width: 3px;
  }

  .chat-box::-webkit-scrollbar-track {
    background: #ddd;
  }

  .chat-box::-webkit-scrollbar-thumb {
    background: #aaa;
  }

  .chat-box .smile {
    font-size: 1.5em;
  }

  .face {
    margin: .5rem 0;
    text-align: center;
    font-size: 12px;
  }

  .face:hover {
    background: darkgray;
    cursor: pointer;
  }

  .faces .column {
    min-width: 50px;
  }


</style>
