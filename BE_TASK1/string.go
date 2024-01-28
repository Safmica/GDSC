package main

import (
  "fmt"
  "strings"
)

func main() {
  var S, T string
  fmt.Scan(&S, &T)

  for strings.Contains(S, T) {
    index := strings.Index(S, T)
    S = S[:index] + S[index+len(T):]
  }

  fmt.Println(S)
}
