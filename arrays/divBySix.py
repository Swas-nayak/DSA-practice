'''Given a number, the task is to check if a number is divisible by 6 or not. The input number may be large and it may not be possible to store even if we use long long int.'''

if __name__=="__main__":
  N=input("Enter a number: ")
if int(N)%6==0:
  print("Yes")
else:
  print("No")