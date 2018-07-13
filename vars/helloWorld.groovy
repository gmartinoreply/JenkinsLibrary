#!/usr/bin/env groovy

def call(body) {

  def config = [:]
  body.resolveStrategy = Closure.DELEGATE_FIRST
  body.delegate = config
  body()

  echo "Hello, World!"
  echo "Hello, ${config.name}!"
}

/*#!/usr/bin/env groovy

def call() {
  echo "Hello, ${name}."
}*/
