package main

import "fmt"

func main() {
  var a, c int
  fmt.Scan(&a)
  
  hasil:=1
  for b:=1;b<=a;b++{
  c=b
  if b%2==0{
    c/=2
  }
  hasil*=c
  }
  fmt.Print(hasil)
}
