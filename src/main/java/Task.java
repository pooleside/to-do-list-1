public class Task {

//these are the properties (buckets) where the class stores data
  private String mDescription;

  //This is the constructor.  It creates a new Rectangle instance.
  public Task (String description){
    mDescription = description;  //Filling the properties with parameter value
  }
      //Method section
      //Method that gets the string from the properties.
      public String getDescription(){
        return mDescription; // do not put = because just returning a variable that is
                        //already filled by the constructor.  This is why we
                        //have a constructor.  We have created our getDescription
                        //method.
      }

      //Method that gets the length.
      //public int getHeight(){
        //return mHeight;
      //}
      //Methods that start with "is" are booleans
      //public boolean isSquare(){
        //return mWidth == mHeight;  //This is an expression.  Do these equal?
                                  //If so, will automatically return true.  If
                                  // not false.
      //}
      //public int getSurfaceArea(){
        //return mWidth * mHeight;
      //}
}
