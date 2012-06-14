package launch {
  class Booster3
}

package rocket_panda {
  package navigation {
    package launch {
      class Booster1
    }
    
    class MissionControl {
      val booster1 = new launch.Booster1
      val booster2 = new rocket_panda.launch.Booster2
      val booster3 = new _root_.launch.Booster3
    }
  }
  
  package launch {
    class Booster2
  }
}