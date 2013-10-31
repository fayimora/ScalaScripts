object PythagoreanTriplet extends App{
  for(i <- 1 to 1000; j <- i to 1000-i; k <- j to 1000-(i+j)
  if (i+j+k==1000 && ((i*i+j*j)==k*k)) ) println(i*j*k)
}
