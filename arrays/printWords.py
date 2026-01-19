N="1234567890"
def getDigit(N):
  i=0
  while len(N)>=0:
    printWords(N[i])
    i+=1
def printWords(digits):
  if digits =='0':
    print("Zero ")  
  elif digits=='1':
    print("One ")
  elif digits=='2':
    print("Two ")
  elif digits=='3':
    print("Three ")
  elif digits=='4':
    print("Four ")
  elif digits=='5':
    print("Five ")
  elif digits=='6':
    print("Six ")
  elif digits=='7':
    print("Seven ")
  elif digits=='8':
    print("Eight ")
  elif digits=='9':
    print("Nine ")
  else:
    print("Invalid")

