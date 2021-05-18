#!/usr/bin/env groovy


def call(String variablesOverrides = "", String tfCliArgsInit = "", Boolean isDestroy = false) {
 
      return variablesOverrides+tfCliArgsInit+"always"+isDestroy;
   }

def destroy() {
   return call(isDestroy = true)
}
