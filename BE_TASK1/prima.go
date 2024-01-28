package main

import "fmt"

func isPrime(num int) bool {
  if num < 2 {
    return false
  }
  for i := 2; i*i <= num; i++ {
    if num%i == 0 {
      return false
    }
  }
  return true
}

func main() {
  var a, b int

  fmt.Scanln(&a)

  for c := 1; c <= a; c++{
    fmt.Scanln(&b)
    if isPrime(b) {
      fmt.Println("YA")
    } else {
      fmt.Println("BUKAN")
    }
  }
}
