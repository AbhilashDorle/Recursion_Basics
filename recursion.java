//Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared)

public int powerN(int base, int n) {
  if(n==1)
  return base;

  else
  return base*powerN(base, n-1);
}

//Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.

public int countX(String str) {
  if(str.isEmpty())
    return 0;
  if(str.length()<=1)
  {
    if(str.charAt(0)=='x')
      return 1;
    else
      return 0;
  }

  if(str.charAt(0)=='x')
    return 1+countX(str.substring(1,str.length()));
  else
    return countX(str.substring(1,str.length()));
}

//Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.

public int countHi(String str) {
  if(str.length()<2)
    return 0;
  if(str.substring(0,2).equals("hi"))
    return 1+countHi(str.substring(2,str.length()));
  else
    return countHi(str.substring(1,str.length()));
}

//Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.

public String changeXY(String str) {
  if(str.length()==0)
    return str;

  if(str.charAt(0)=='x')
    return 'y'+changeXY(str.substring(1,str.length()));
  else
    return str.charAt(0)+changeXY(str.substring(1,str.length()));
}

//Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".

public String changePi(String str) {
  if(str.length()<2)
    return str;

  if(str.substring(0,2).equals("pi"))
    return "3.14"+changePi(str.substring(2));
  else
    return str.charAt(0)+changePi(str.substring(1));
}

//Given a string, compute recursively a new string where all the 'x' chars have been removed.

public String noX(String str) {
  if(str.length()==0)
    return str;

  if(str.charAt(0)=='x')
    return noX(str.substring(1));

  return str.charAt(0) + noX(str.substring(1));
}

//Given an array of ints, compute recursively if the array contains a 6. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.


public boolean array6(int[] nums, int index) {
  if(nums.length==0)
    return false;
  if(index==nums.length-1)
  {
    if(nums[index]==6)
      return true;
    else
      return false;
  }

  if(nums[index]==6)
    return true;

  return array6(nums,index+1);
}

//Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".

public String allStar(String str) {
  if(str.length()<2)
    return str;

  return str.charAt(0)+"*"+ allStar(str.substring(1));
}

//Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".

public String pairStar(String str) {

  if(str.length()<2)
    return str;

  if(str.charAt(0)==str.charAt(1))
    return str.charAt(0)+"*"+pairStar(str.substring(1));
  else
    return str.charAt(0)+pairStar(str.substring(1));
}

//Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.

public String endX(String str) {
  if(str.length()<2)
    return str;

  if(str.charAt(0)=='x')
    return endX(str.substring(1)) + str.charAt(0);
  else
    return str.charAt(0)+endX(str.substring(1));
}

//We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Recursively compute the number of pairs in the given string.


public int countPairs(String str) {
  if(str.length()<3)
  {
    return 0;
  }

  if(str.charAt(0)==str.charAt(2))
    return 1+countPairs(str.substring(1));
  else
    return 0+countPairs(str.substring(1));
}
