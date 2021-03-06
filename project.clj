(defproject appengine "0.4.3-SNAPSHOT"
  :author "John D. Hume, Roman Scherer, Jean-Denis Greze, 深町英太郎 (E. Fukamachi)"
  :description "A Clojure library for Google App Engine."
  :url "http://github.com/r0man/appengine-clj"
  :autodoc {:name "Clojure for Google App Engine"
            :web-src-dir "http://github.com/r0man/appengine-clj/blob/"
            :web-home "http://r0man.github.com/appengine-clj/"
            :copyright "Copyright (c) 2009, 2010 John D. Hume, Roman Scherer, Jean-Denis Greze, E.Fukamachi"}
  :dependencies [[com.google.appengine/appengine-api-1.0-sdk "1.4.3"]
                 [inflections "0.4.3"]
                 [org.clojure/clojure "1.2.1"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [ring/ring-servlet "0.3.8"]]
  :dev-dependencies [[autodoc "0.7.1"  :exclusions [org.clojure/clojure
						   org.clojure/clojure-contrib
                                                   ant/ant
                                                   ant/ant-launcher]]
                     [lein-clojars "0.5.0"]
                     [com.google.appengine/appengine-api-labs "1.4.3"]
                     [com.google.appengine/appengine-api-stubs "1.4.3"]
                     [com.google.appengine/appengine-local-runtime "1.4.3"]
                     [com.google.appengine/appengine-local-runtime-shared "1.4.3"]
                     [com.google.appengine/appengine-testing "1.4.3"]
                     [ring/ring-jetty-adapter "0.3.8"]
                     [swank-clojure "1.3.1"]]
  :repositories {"maven-gae-plugin" "http://maven-gae-plugin.googlecode.com/svn/repository"})
