#yuvaraj@kripya.com
@Calendar
Feature: Data Setup for Calendar


  Scenario Outline: calendar setup for season
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then User moves into Calendar Template setup
    And User create Calendar Type for season "<calendartype>","<templatecalendar>","<calendardescription>"
    Then user create season Template activity under Calendar Type "<Templateactivity>","<ActivityType>","<ActivityLevel>","<TrackingType>","<TrackingPhase>","<Trackingstate>"

    Examples: 
      | calendartype | templatecalendar | calendardescription      | Templateactivity                         | ActivityType                   | ActivityLevel          | TrackingType             | TrackingPhase     | Trackingstate |
      | Season       | Calendar_Season  | Season calendar Template | Manual,Milestone,Artwork Track,IDS Track | Manual Activity,Track Activity | Brand,Collection,Style | Artwork,Image Data Sheet | Production,sample | APPROVED      |

@Calendar_Setup
  Scenario Outline: calendar setup for material
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then User moves into Calendar Template setup
    And User create Calendar Type for material "<calendartype>","<templatecalendar>","<calendardescription>"
    Then user create material Template activity under Calendar Type "<Templateactivity>","<ActivityType>","<ActivityLevel>","<TrackingType>","<Trackingstate>"
     Then Logout from the Application
    
    Examples: 
      | calendartype            | templatecalendar | calendardescription   | Templateactivity                                                 | ActivityType                             | ActivityLevel                        | TrackingType                                    | Trackingstate    |
      | Material Security Group | Calendar_MSG     | MSG Calendar Template | Manual,BOM Track,Color Data Sheet Track,Test Run Track,Milestone | Manual Activity,Track Activity,Milestone | Material Security Group,Material BOM | Material BOM,Material Color Data Sheet,Test Run | APPROVED,PENDING |
