<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>body_Home                     About ODEW   _fa65b6</name>
   <tag></tag>
   <elementGuidId>3f6fe089-0318-47e5-bf79-779112f2a2bc</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//body</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>body</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>body</value>
      <webElementGuid>aa381ab8-41c7-404e-8aae-90e28639919c</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
    
        
            
                
                    Home |
                    About ODEW |
                    State Agencies |
                    Online Services |
                    
                
            
        
    
    
        
            
            
                 
            


            
            
            

            
            

            
        

    
    
    
        
            
                
                 Contact Us

            
        
    



    
        















    $(function () {
        // Round corners

        //    $(&quot;.rounded_colhead&quot;).corner(&quot;round 12px&quot;).parent().css('padding', '2px').corner(&quot;round 13px&quot;);

        $(&quot;#dialog:ui-dialog&quot;).dialog(&quot;destroy&quot;);


        $(&quot;#alertDialog&quot;).dialog({

            autoOpen: false,
            modal: true,
            resizable: true,
            stack: true,
            postion: 'center',
            title: 'System Error!',
            buttons: [{
                text: &quot;Close&quot;,
                click: function () {
                    $(this).dialog(&quot;close&quot;);
                }
            }]
        });

        function bmvCheck(path) {
            $.ajaxSetup({ &quot;error&quot;: function () { $(&quot;#lalertDialog&quot;).dialog(&quot;open&quot;); } });
            var loc = window.location;

            $.getJSON(loc.protocol + &quot;//&quot; + loc.hostname + &quot;/portal/Home/SignUpAction&quot;, null, function (data) {
                if (data == &quot;success&quot;) {
                    location = loc.protocol + &quot;//&quot; + loc.hostname + &quot;/portal/&quot; + path;
                    return false;
                }
                else {
                    $(&quot;#alertDialog&quot;).show();
                    $(&quot;#alertDialog&quot;).dialog(&quot;open&quot;);
                    return false;
                }
            });
        }
        $('#btnSignup').click(function () {
            bmvCheck('signup/signup');
        });

        $('#status').click(function () {
            var loc = window.location;
            location = loc.protocol + &quot;//&quot; + loc.hostname + &quot;/portal/signup/checkstatus&quot;;
        });

        $('#PasswordRecoveryLink').click(function () {
            bmvCheck('PasswordRecovery/Index');
        });

        $('#passwordRecovery').click(function () {
            bmvCheck('PasswordRecovery/Index');
        });

        //Get account signup status

    });





    $(document).ready(function () {
        $('#UserName').focus();
        //Hide div w/id extra
        $(&quot;#EmpMsg&quot;).css(&quot;display&quot;, &quot;none&quot;);

        // Add onclick handler to checkbox w/id checkme
        $(&quot;#IsEmployee&quot;).click(function () {

            // If checked
            if ($(&quot;#IsEmployee&quot;).is(&quot;:checked&quot;)) {
                //show the hidden div
                $(&quot;#EmpMsg&quot;).show(&quot;fast&quot;);
            } else {
                //otherwise, hide it
                $(&quot;#EmpMsg&quot;).hide(&quot;fast&quot;);
            }
        });

    });







    
        
            
                
                    
                        
                            Sign in with your SAFE Account
                        
                        
                            Click to View Instructions
                        
                    
                    
                            
                                

                            
                            
                                
                                    
                                    Check if you are an ODE employee.
                                
                                
                                    State of Ohio employees should use their 8-digit State of Ohio User ID and password.
                                
                            
                            
                            
                                User Name
                                
                                    
                                
                            
                            
                                Password
                                
                                    

                                



                            
                            
                                
                                    

                                        Sign in

                                        
                                            Forgot user name or password?
                                        
                                    
                                
                            
                        
                        
                            
                                
                                    Don't have a SAFE account?
                                    
                                        

                                        Sign Up


                                    
                                    
                                    Safe Sign up help
                                
                            
                            
                                
                                    Started sign up process?
                                    
                                    



                                        Check Sign Up Status
                                    
                                
                            
                        
                    
                
            
        

        
            
                
                    
                        
                            What is SAFE?
                        
                    
                    
                        
                            The Ohio Department of Education (ODE) launched the Security Application For Enterprise
                            (SAFE) Web portal in May, 2003. SAFE is a Web Portal and a &quot;single sign on&quot; software
                            security solution for ODE customers.
                        

                    
                
            
        
    

    
        
            
                
                    
                        
                            Please choose a login option
                        
                        
                            Click to View Instructions
                        
                    
                    
                        
                            
                                
                                    
                                        If you are an Ohio Department of Education employee, please click the “Ohio Department of Education Employees” button.
                                    
                                    
                                    
                                        Ohio Department of Education Employees
                                    
                                    
                                    
                                        If you are a superintendent, principal, teacher, school administrator, parent or other user, please click the “All Other Users” button.
                                    
                                    
                                    
                                        All Other Users
                                    
                                
                            
                        
                    
                
            
        
        
        

        
            
            
                
                    This is a restricted use computer system. Unauthorized access and/or use is prohibited
                    by law. All users accessing this system are subject to having all of their activities
                    on this system monitored and recorded by system personnel. This system may be monitored
                    for a variety of reasons such as maintenance, troubleshooting and investigating
                    suspected or known unauthorized activity. Users should not have an expectation of
                    privacy while using this system.
                

                
                    Anyone using this system expressly consents to having their activities monitored
                    and is advised that if a review reveals possible evidence of abuse or criminal activity,
                    system personnel may provide the evidence of such monitoring to law enforcement
                    and/or appropriate department officials.
                
            
        
    

        
    


    
        
            
                    
                        
                            
                                Ohio Department of Education and Workforce
                            
                    
                            
                                
                                    Stephen D. Dackin, Director
                                    
                                    
                                      25 South Front Street, Columbus, Ohio 43215
                                    
                                
                            
                    
                            
                                
                                    1-877-644-6338
                                    
                                    contact.center@education.ohio.gov
                                    
                                
                            
                        

                    
                    
                        

                            Mike DeWine, Governor
                             | 
                            Privacy
                             | 
                            Site Map
                             | 
                            Ohio Checkbook
                             | 
                            Sign-up for Alerts 
                        

                    
                
                
                    The Department of Education and Workforce is an equal opportunity provider of ADA services.
                

            

        
                Desktop View
            
        
    



    



System Error!close
    
         Bureau of Motor Vehicles services to verify your identity are unavailable. Please try again later.
    
Close/html[1]/body[1]</value>
      <webElementGuid>65a9cb1f-22f3-43d0-913d-cfea00e9ca8e</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[1]</value>
      <webElementGuid>1801057a-bed1-4192-990f-969b7d5a47e8</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//body</value>
      <webElementGuid>0b08f185-bb23-4098-b58b-edffb9131843</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//body[(text() = concat(&quot;
    
        
            
                
                    Home |
                    About ODEW |
                    State Agencies |
                    Online Services |
                    
                
            
        
    
    
        
            
            
                 
            


            
            
            

            
            

            
        

    
    
    
        
            
                
                 Contact Us

            
        
    



    
        















    $(function () {
        // Round corners

        //    $(&quot;.rounded_colhead&quot;).corner(&quot;round 12px&quot;).parent().css(&quot; , &quot;'&quot; , &quot;padding&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;2px&quot; , &quot;'&quot; , &quot;).corner(&quot;round 13px&quot;);

        $(&quot;#dialog:ui-dialog&quot;).dialog(&quot;destroy&quot;);


        $(&quot;#alertDialog&quot;).dialog({

            autoOpen: false,
            modal: true,
            resizable: true,
            stack: true,
            postion: &quot; , &quot;'&quot; , &quot;center&quot; , &quot;'&quot; , &quot;,
            title: &quot; , &quot;'&quot; , &quot;System Error!&quot; , &quot;'&quot; , &quot;,
            buttons: [{
                text: &quot;Close&quot;,
                click: function () {
                    $(this).dialog(&quot;close&quot;);
                }
            }]
        });

        function bmvCheck(path) {
            $.ajaxSetup({ &quot;error&quot;: function () { $(&quot;#lalertDialog&quot;).dialog(&quot;open&quot;); } });
            var loc = window.location;

            $.getJSON(loc.protocol + &quot;//&quot; + loc.hostname + &quot;/portal/Home/SignUpAction&quot;, null, function (data) {
                if (data == &quot;success&quot;) {
                    location = loc.protocol + &quot;//&quot; + loc.hostname + &quot;/portal/&quot; + path;
                    return false;
                }
                else {
                    $(&quot;#alertDialog&quot;).show();
                    $(&quot;#alertDialog&quot;).dialog(&quot;open&quot;);
                    return false;
                }
            });
        }
        $(&quot; , &quot;'&quot; , &quot;#btnSignup&quot; , &quot;'&quot; , &quot;).click(function () {
            bmvCheck(&quot; , &quot;'&quot; , &quot;signup/signup&quot; , &quot;'&quot; , &quot;);
        });

        $(&quot; , &quot;'&quot; , &quot;#status&quot; , &quot;'&quot; , &quot;).click(function () {
            var loc = window.location;
            location = loc.protocol + &quot;//&quot; + loc.hostname + &quot;/portal/signup/checkstatus&quot;;
        });

        $(&quot; , &quot;'&quot; , &quot;#PasswordRecoveryLink&quot; , &quot;'&quot; , &quot;).click(function () {
            bmvCheck(&quot; , &quot;'&quot; , &quot;PasswordRecovery/Index&quot; , &quot;'&quot; , &quot;);
        });

        $(&quot; , &quot;'&quot; , &quot;#passwordRecovery&quot; , &quot;'&quot; , &quot;).click(function () {
            bmvCheck(&quot; , &quot;'&quot; , &quot;PasswordRecovery/Index&quot; , &quot;'&quot; , &quot;);
        });

        //Get account signup status

    });





    $(document).ready(function () {
        $(&quot; , &quot;'&quot; , &quot;#UserName&quot; , &quot;'&quot; , &quot;).focus();
        //Hide div w/id extra
        $(&quot;#EmpMsg&quot;).css(&quot;display&quot;, &quot;none&quot;);

        // Add onclick handler to checkbox w/id checkme
        $(&quot;#IsEmployee&quot;).click(function () {

            // If checked
            if ($(&quot;#IsEmployee&quot;).is(&quot;:checked&quot;)) {
                //show the hidden div
                $(&quot;#EmpMsg&quot;).show(&quot;fast&quot;);
            } else {
                //otherwise, hide it
                $(&quot;#EmpMsg&quot;).hide(&quot;fast&quot;);
            }
        });

    });







    
        
            
                
                    
                        
                            Sign in with your SAFE Account
                        
                        
                            Click to View Instructions
                        
                    
                    
                            
                                

                            
                            
                                
                                    
                                    Check if you are an ODE employee.
                                
                                
                                    State of Ohio employees should use their 8-digit State of Ohio User ID and password.
                                
                            
                            
                            
                                User Name
                                
                                    
                                
                            
                            
                                Password
                                
                                    

                                



                            
                            
                                
                                    

                                        Sign in

                                        
                                            Forgot user name or password?
                                        
                                    
                                
                            
                        
                        
                            
                                
                                    Don&quot; , &quot;'&quot; , &quot;t have a SAFE account?
                                    
                                        

                                        Sign Up


                                    
                                    
                                    Safe Sign up help
                                
                            
                            
                                
                                    Started sign up process?
                                    
                                    



                                        Check Sign Up Status
                                    
                                
                            
                        
                    
                
            
        

        
            
                
                    
                        
                            What is SAFE?
                        
                    
                    
                        
                            The Ohio Department of Education (ODE) launched the Security Application For Enterprise
                            (SAFE) Web portal in May, 2003. SAFE is a Web Portal and a &quot;single sign on&quot; software
                            security solution for ODE customers.
                        

                    
                
            
        
    

    
        
            
                
                    
                        
                            Please choose a login option
                        
                        
                            Click to View Instructions
                        
                    
                    
                        
                            
                                
                                    
                                        If you are an Ohio Department of Education employee, please click the “Ohio Department of Education Employees” button.
                                    
                                    
                                    
                                        Ohio Department of Education Employees
                                    
                                    
                                    
                                        If you are a superintendent, principal, teacher, school administrator, parent or other user, please click the “All Other Users” button.
                                    
                                    
                                    
                                        All Other Users
                                    
                                
                            
                        
                    
                
            
        
        
        

        
            
            
                
                    This is a restricted use computer system. Unauthorized access and/or use is prohibited
                    by law. All users accessing this system are subject to having all of their activities
                    on this system monitored and recorded by system personnel. This system may be monitored
                    for a variety of reasons such as maintenance, troubleshooting and investigating
                    suspected or known unauthorized activity. Users should not have an expectation of
                    privacy while using this system.
                

                
                    Anyone using this system expressly consents to having their activities monitored
                    and is advised that if a review reveals possible evidence of abuse or criminal activity,
                    system personnel may provide the evidence of such monitoring to law enforcement
                    and/or appropriate department officials.
                
            
        
    

        
    


    
        
            
                    
                        
                            
                                Ohio Department of Education and Workforce
                            
                    
                            
                                
                                    Stephen D. Dackin, Director
                                    
                                    
                                      25 South Front Street, Columbus, Ohio 43215
                                    
                                
                            
                    
                            
                                
                                    1-877-644-6338
                                    
                                    contact.center@education.ohio.gov
                                    
                                
                            
                        

                    
                    
                        

                            Mike DeWine, Governor
                             | 
                            Privacy
                             | 
                            Site Map
                             | 
                            Ohio Checkbook
                             | 
                            Sign-up for Alerts 
                        

                    
                
                
                    The Department of Education and Workforce is an equal opportunity provider of ADA services.
                

            

        
                Desktop View
            
        
    



    



System Error!close
    
         Bureau of Motor Vehicles services to verify your identity are unavailable. Please try again later.
    
Close/html[1]/body[1]&quot;) or . = concat(&quot;
    
        
            
                
                    Home |
                    About ODEW |
                    State Agencies |
                    Online Services |
                    
                
            
        
    
    
        
            
            
                 
            


            
            
            

            
            

            
        

    
    
    
        
            
                
                 Contact Us

            
        
    



    
        















    $(function () {
        // Round corners

        //    $(&quot;.rounded_colhead&quot;).corner(&quot;round 12px&quot;).parent().css(&quot; , &quot;'&quot; , &quot;padding&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;2px&quot; , &quot;'&quot; , &quot;).corner(&quot;round 13px&quot;);

        $(&quot;#dialog:ui-dialog&quot;).dialog(&quot;destroy&quot;);


        $(&quot;#alertDialog&quot;).dialog({

            autoOpen: false,
            modal: true,
            resizable: true,
            stack: true,
            postion: &quot; , &quot;'&quot; , &quot;center&quot; , &quot;'&quot; , &quot;,
            title: &quot; , &quot;'&quot; , &quot;System Error!&quot; , &quot;'&quot; , &quot;,
            buttons: [{
                text: &quot;Close&quot;,
                click: function () {
                    $(this).dialog(&quot;close&quot;);
                }
            }]
        });

        function bmvCheck(path) {
            $.ajaxSetup({ &quot;error&quot;: function () { $(&quot;#lalertDialog&quot;).dialog(&quot;open&quot;); } });
            var loc = window.location;

            $.getJSON(loc.protocol + &quot;//&quot; + loc.hostname + &quot;/portal/Home/SignUpAction&quot;, null, function (data) {
                if (data == &quot;success&quot;) {
                    location = loc.protocol + &quot;//&quot; + loc.hostname + &quot;/portal/&quot; + path;
                    return false;
                }
                else {
                    $(&quot;#alertDialog&quot;).show();
                    $(&quot;#alertDialog&quot;).dialog(&quot;open&quot;);
                    return false;
                }
            });
        }
        $(&quot; , &quot;'&quot; , &quot;#btnSignup&quot; , &quot;'&quot; , &quot;).click(function () {
            bmvCheck(&quot; , &quot;'&quot; , &quot;signup/signup&quot; , &quot;'&quot; , &quot;);
        });

        $(&quot; , &quot;'&quot; , &quot;#status&quot; , &quot;'&quot; , &quot;).click(function () {
            var loc = window.location;
            location = loc.protocol + &quot;//&quot; + loc.hostname + &quot;/portal/signup/checkstatus&quot;;
        });

        $(&quot; , &quot;'&quot; , &quot;#PasswordRecoveryLink&quot; , &quot;'&quot; , &quot;).click(function () {
            bmvCheck(&quot; , &quot;'&quot; , &quot;PasswordRecovery/Index&quot; , &quot;'&quot; , &quot;);
        });

        $(&quot; , &quot;'&quot; , &quot;#passwordRecovery&quot; , &quot;'&quot; , &quot;).click(function () {
            bmvCheck(&quot; , &quot;'&quot; , &quot;PasswordRecovery/Index&quot; , &quot;'&quot; , &quot;);
        });

        //Get account signup status

    });





    $(document).ready(function () {
        $(&quot; , &quot;'&quot; , &quot;#UserName&quot; , &quot;'&quot; , &quot;).focus();
        //Hide div w/id extra
        $(&quot;#EmpMsg&quot;).css(&quot;display&quot;, &quot;none&quot;);

        // Add onclick handler to checkbox w/id checkme
        $(&quot;#IsEmployee&quot;).click(function () {

            // If checked
            if ($(&quot;#IsEmployee&quot;).is(&quot;:checked&quot;)) {
                //show the hidden div
                $(&quot;#EmpMsg&quot;).show(&quot;fast&quot;);
            } else {
                //otherwise, hide it
                $(&quot;#EmpMsg&quot;).hide(&quot;fast&quot;);
            }
        });

    });







    
        
            
                
                    
                        
                            Sign in with your SAFE Account
                        
                        
                            Click to View Instructions
                        
                    
                    
                            
                                

                            
                            
                                
                                    
                                    Check if you are an ODE employee.
                                
                                
                                    State of Ohio employees should use their 8-digit State of Ohio User ID and password.
                                
                            
                            
                            
                                User Name
                                
                                    
                                
                            
                            
                                Password
                                
                                    

                                



                            
                            
                                
                                    

                                        Sign in

                                        
                                            Forgot user name or password?
                                        
                                    
                                
                            
                        
                        
                            
                                
                                    Don&quot; , &quot;'&quot; , &quot;t have a SAFE account?
                                    
                                        

                                        Sign Up


                                    
                                    
                                    Safe Sign up help
                                
                            
                            
                                
                                    Started sign up process?
                                    
                                    



                                        Check Sign Up Status
                                    
                                
                            
                        
                    
                
            
        

        
            
                
                    
                        
                            What is SAFE?
                        
                    
                    
                        
                            The Ohio Department of Education (ODE) launched the Security Application For Enterprise
                            (SAFE) Web portal in May, 2003. SAFE is a Web Portal and a &quot;single sign on&quot; software
                            security solution for ODE customers.
                        

                    
                
            
        
    

    
        
            
                
                    
                        
                            Please choose a login option
                        
                        
                            Click to View Instructions
                        
                    
                    
                        
                            
                                
                                    
                                        If you are an Ohio Department of Education employee, please click the “Ohio Department of Education Employees” button.
                                    
                                    
                                    
                                        Ohio Department of Education Employees
                                    
                                    
                                    
                                        If you are a superintendent, principal, teacher, school administrator, parent or other user, please click the “All Other Users” button.
                                    
                                    
                                    
                                        All Other Users
                                    
                                
                            
                        
                    
                
            
        
        
        

        
            
            
                
                    This is a restricted use computer system. Unauthorized access and/or use is prohibited
                    by law. All users accessing this system are subject to having all of their activities
                    on this system monitored and recorded by system personnel. This system may be monitored
                    for a variety of reasons such as maintenance, troubleshooting and investigating
                    suspected or known unauthorized activity. Users should not have an expectation of
                    privacy while using this system.
                

                
                    Anyone using this system expressly consents to having their activities monitored
                    and is advised that if a review reveals possible evidence of abuse or criminal activity,
                    system personnel may provide the evidence of such monitoring to law enforcement
                    and/or appropriate department officials.
                
            
        
    

        
    


    
        
            
                    
                        
                            
                                Ohio Department of Education and Workforce
                            
                    
                            
                                
                                    Stephen D. Dackin, Director
                                    
                                    
                                      25 South Front Street, Columbus, Ohio 43215
                                    
                                
                            
                    
                            
                                
                                    1-877-644-6338
                                    
                                    contact.center@education.ohio.gov
                                    
                                
                            
                        

                    
                    
                        

                            Mike DeWine, Governor
                             | 
                            Privacy
                             | 
                            Site Map
                             | 
                            Ohio Checkbook
                             | 
                            Sign-up for Alerts 
                        

                    
                
                
                    The Department of Education and Workforce is an equal opportunity provider of ADA services.
                

            

        
                Desktop View
            
        
    



    



System Error!close
    
         Bureau of Motor Vehicles services to verify your identity are unavailable. Please try again later.
    
Close/html[1]/body[1]&quot;))]</value>
      <webElementGuid>696d4247-ae0b-4479-ac73-54d260129a1b</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
