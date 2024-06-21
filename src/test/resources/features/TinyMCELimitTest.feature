Feature: TinyMCE Limit Testing

  @@TinyMCETest
  Scenario: Test TinyMCE Limit On Assessment Page
    Given User go to Portal Sekolah login page
    When User login with "yuqi" as username and "password123*" as password
    And User go to create assessment page
    Then User already on create assessment page
    And User refresh create assessment page 1000 times
    And User success to input text "Testing Instruction Text Editor TinyMCE" Instuction Box TinyMCE
