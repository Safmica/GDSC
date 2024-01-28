package main

import "fmt"

func main() {
  var a, b int
  fmt.Scanln(&a, &b)

  matrix := make([][]int, a)
  for i := 0; i < a; i++ {
    matrix[i] = make([]int, b)
    for j := 0; j < b; j++ {
      fmt.Scan(&matrix[i][j])
    }
  }

  for j := 0; j < b; j++ {
    for i := a - 1; i >= 0; i-- {
      fmt.Print(matrix[i][j])
      if i > 0 {
        fmt.Print(" ")
      }
    }
    fmt.Println()
  }
}
