package main

import "fmt"

func main() {
  var a int
  fmt.Scanln(&a)
  if a > 0 {
    fmt.Print(a)
  }
}