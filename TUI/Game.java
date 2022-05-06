class Game {

      private int players;

      public Game(final int players) {
      this.players = players;
      }

     }


     class TurnBasedGame extends Game {

      private int currentPlayer;

      public TurnBased(final int players) {
      super(players);
      }

      public int getCurrentPlayer() {
      return currentPlayer;
      }
     }


     class RealTimeGame extends Game {
      private boolean paused;
      public RealTime(final int players) {
      super(players);
      }
     }
     class Monopoly extends TurnBased {
      private int bankMoney;
      public Monopoly(final int players) {
      super(players);
      bankMoney = 10000;
      }
     }
     class Battleship extends TurnBased {
      private int initialShips;
      public Battleship(final int players) {
      super(players);
      initialShips = 10;
      }
     }
