package main

import "fmt"

func main() {
  var a ,b int
  c := 0
  fmt.Scan(&a)
  for d := 1;d<=a;d++{
    fmt.Scan(&b)
    c += b
  }
  fmt.Print(c)
}