def countOddEven(arr):
  evenCount=0
  oddCount=0
  for num in arr:
    if num%2 ==0:
      evenCount+=1
    else:
      oddCount+=1
  return oddCount,evenCount