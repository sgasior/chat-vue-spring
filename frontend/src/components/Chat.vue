<template>
  <main>
    <div class="ui grid centered">
      <div class="eight wide computer fourteen wide phone column box2 chat-box">
        <div class="ui grey ribbon label">Welcome to chat {{userName}}</div>
        <div class="ui card">
          <div class="ui segments">
            <div class="ui segment">
              <div class="ui purple horizontal label">{{userName}}</div>
              message
            </div>
            <div class="ui segment">
              <div class="ui purple horizontal label">Candy</div>

            </div>
            <div class="ui segment">
              <div class="ui purple horizontal label">Candy</div>
              Top
            </div>
            <div class="ui segment">
              <div class="ui purple horizontal label">Candy</div>
              Top
            </div>
            <div class="ui segment">
              <div class="ui blue horizontal label">Candy</div>
              Top
            </div>
            <div class="ui segment">
              <div class="ui purple horizontal label">Candy</div>
              Top
            </div>
            <div class="ui segment">
              <div class="ui purple horizontal label">Candy</div>
              Top
            </div>
            <div class="ui segment">
              <div class="ui purple horizontal label">Candy</div>
              Top
            </div>
            <div class="ui segment">
              <div class="ui purple horizontal label">Candy</div>
              Top
            </div>
            <div class="ui segment">
              <div class="ui purple horizontal label">Candy</div>
              Top
            </div>
          </div>
        </div>
        <div class="ui fluid action input">
          <input type="text" placeholder="Message...">

          <div class="ui button btn-pop"><i class="smile outline icon"></i></div>
          <div class="ui flowing popup transition hidden">
            <div class="faces">
              <div class="ui grid">
                <div class="three column row">
                  <div class="column">
                    <div class="face">( ͡o ͜ʖ ͡o)</div>
                  </div>
                  <div class="column">
                    <div class="face">( ͡o ͜ʖ ͡o)</div>
                  </div>
                  <div class="column">
                    <div class="face">(▀̿Ĺ̯▀̿ ̿)</div>
                  </div>
                  <div class="column">
                    <div class="face">¯\_( ͡° ͜ʖ ͡°)_/¯</div>
                  </div>
                  <div class="column">
                    <div class="face">ᕦ( ͡° ͜ʖ ͡°)ᕤ</div>
                  </div>
                  <div class="column">
                    <div class="face">¯\_(ツ)_/¯</div>
                  </div>
                  <div class="column">
                    <div class="face">( ͡° ͜ʖ ͡°)╭∩╮</div>
                  </div>
                  <div class="column">
                    <div class="face">( ͡°( ͡° ͜ʖ( ͡° ͜ʖ ͡°)ʖ ͡°) ͡°)</div>
                  </div>
                  <div class="column">
                    <div class="face">( ͡ʘ ͜ʖ ͡ʘ)</div>
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
    props: ["userName"],
    mounted() {
      $('.btn-pop')
        .popup({
          on: 'click',
          position   : 'top right',
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
