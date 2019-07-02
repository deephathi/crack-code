package com.deephathi.crack.code.ch1_stringarrays.ex1_4

import spock.lang.Specification

class PalindromePermutationsTest extends Specification {

    def "checks whether a string is a permutation of a palindrome"() {
        setup:
            PalindromePermutationsChecker checker = new PalindromePermutationCheckerByCharCountings()

        when:
            def result = checker.isPalindromePermutations("Tact Coa")

        then:
            result

    }
}
