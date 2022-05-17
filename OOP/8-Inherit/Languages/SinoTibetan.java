public class SinoTibetan extends Language {

    public SinoTibetan(String name, int numSpeakers) {
      super(name, numSpeakers, "Asia", "sub,obj,verb");
      if (name.contains("Chinese")){
        this.wordOrder = "subject-verb-object";
      }
    }
  
    @Override
    public void getInfo() {
      System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ". The language follows the word order: " + this.wordOrder + " Fun fact: " + this.name + " is an ergative language.");
    }
  }