                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    package com.deephathi.crack.code.ch1_stringarrays.ex1_2

import groovy.time.TimeCategory
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    import groovy.time.TimeDuration
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class StringPermutationsTest extends Specification {


    def "Returns true when one string is a permutation of another when all chars are lower with #stringPermutationsImpl"() {
        setup:
            StringPermutations permutations = stringPermutationsImpl

        when:
            def startTime = System.nanoTime()
            def result = permutations.isFirstStringPermutationOfSecond("application", "papilcainot")
            def stopTime = System.nanoTime()
            println("Total time taken is " + (stopTime - startTime))

        then:
            result

        where:
            stringPermutationsImpl |_
            new StringPermutationsSorting() |_
            new StringPermutationsHashing() |_
            new StringPermutationsCharCounting() |_
    }

    def "Returns true when one string is a permutation of another when all chars are upper  with #stringPermutationsImpl"() {
        setup:
            StringPermutations permutations = stringPermutationsImpl

        when:
            def startTime = new Date()
            def result = permutations.isFirstStringPermutationOfSecond("MANGO-MAN", "NMA-ONGAM")
            def stopTime = new Date()
            println("Total time taken is " + TimeCategory.minus(stopTime, startTime))

        then:
            result


        where:
            stringPermutationsImpl |_
            new StringPermutationsSorting() |_
            new StringPermutationsHashing() |_
            new StringPermutationsCharCounting() |_
    }

    def "Returns true when one string is a permutation of another when all chars are mixed with #stringPermutationsImpl"() {
        setup:
            StringPermutations permutations = stringPermutationsImpl

        when:
            def startTime = System.nanoTime()
            def result = permutations.isFirstStringPermutationOfSecond("Marvellous-womAn", "A-Awomnmrellosuv")
            def stopTime = System.nanoTime()
            println("Total time taken is " + (stopTime - startTime))

        then:
            result

        where:
            stringPermutationsImpl |_
            new StringPermutationsSorting() |_
            new StringPermutationsHashing() |_
            new StringPermutationsCharCounting() |_
    }

    def "Returns false when one string is not a permutation of another with #stringPermutationsImpl"() {
        setup:
            StringPermutations permutations = stringPermutationsImpl

        when:
            def startTime = new Date()
            def result = permutations.isFirstStringPermutationOfSecond("MANGO-MAN-123456", "NMA-ONGAM-124567")
            def stopTime = new Date()
            println("Total time taken is " + TimeCategory.minus(stopTime, startTime))

        then:
            !result

        where:
            stringPermutationsImpl |_
            new StringPermutationsSorting() |_
            new StringPermutationsHashing() |_
            new StringPermutationsCharCounting() |_
    }
}
