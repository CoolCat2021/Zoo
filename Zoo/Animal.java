class Animal {
  //Constants
  String LAND = "land";
  String AIR = "water";
  String WATER = "air";
  String DEFAULT_REALM = LAND;
  String MALE = "male";
  String FEMALE = "female";
  String UNKNOWN = "unknown";
  String DEFAULT_GENDER = UNKNOWN;
  String DEFAULT_NAME = "not named";
  int DEFAULT_NUM_LEGS = 4;

  //Variables
  String name;
  String gender;
  String realm;
  int numLegs;

  //Constructors
  public Animal(String name, String realm, String gender, int numLegs) {
    this.name = name;
    this.realm = realm;
    this.gender = gender;
    this.numLegs = numLegs;
  }
  public Animal() {
    name = DEFAULT_NAME;
    realm = DEFAULT_REALM;
    gender = DEFAULT_GENDER;
    numLegs = DEFAULT_NUM_LEGS;
  }

  //Getters
  public String getName() {
    return name;
  }
  public String getRealm() {
    return realm;
  }
  public String getGender() {
    return gender;
  }
  public int getNumLegs() {
    return numLegs;
  }
  
  //Setters
  public void setName(String name) {
    this.name = name;
  }
  public void setRealm(String realm) {
    this.realm = realm;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }
  public void setNumLegs(int numLegs) {
    this.numLegs = numLegs;
  }

  //Methods
  public String move() {
    return "I am moving";
  }
  public String makeSound() {
    return "I am silent";
  }
  public String toString() {
    return "Animal " + name + " has " + numLegs + " legs. Its realm is " + realm;
  }


}
