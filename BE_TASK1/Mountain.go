package main

import "fmt"

func drawMountains(N int) {
  if N == 1 {
    fmt.Println("*")
  } else {
    drawMountains(N - 1)
    for i := 0; i < N; i++ {
      fmt.Print("*")
    }
    fmt.Println()
    drawMountains(N - 1)
  }
}

func main() {
  var N int
  fmt.Scan(&N)
  drawMountains(N)
}
