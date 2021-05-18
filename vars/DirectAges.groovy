#!/usr/bin/env groovy

def call(String isDestroy) {
      return isDestroy;
   }

def destroy(String isDestroy) {
   return call(isDestroy)
}
