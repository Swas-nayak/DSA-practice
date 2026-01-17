def arrayAverage(arr):
  sum=0
  if len(arr)==0:
    return 0
  for num in arr:
    sum+=num
  return sum/len(arr)
