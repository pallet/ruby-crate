(ns pallet.crate.ruby-test
  (:use pallet.crate.ruby
        clojure.test
        pallet.test-utils
        [pallet.actions :only [package packages package-manager exec-script exec-checked-script]])
  (:require
   [pallet.build-actions :as build-actions]))

(deftest invoke-test
  (is (build-actions/build-actions
       {}
       (ruby)
       (exec-script
        @(ruby-version))
       (ruby-packages))))
