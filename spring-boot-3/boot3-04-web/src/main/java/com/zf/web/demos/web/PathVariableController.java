/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zf.web.demos.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Stack;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
@Controller
public class PathVariableController {

    // http://127.0.0.1:8080/user/123/roles/222
    @RequestMapping(value = "/user/{userId}/roles/{roleId}", method = RequestMethod.GET)
    @ResponseBody
    public String getLogin(@PathVariable("userId") String userId, @PathVariable("roleId") String roleId) {
        return "User Id : " + userId + " Role Id : " + roleId;
    }

    // http://127.0.0.1:8080/javabeat/somewords
    @RequestMapping(value = "/javabeat/{regexp1:[a-z-]+}", method = RequestMethod.GET)
    @ResponseBody
    public String getRegExp(@PathVariable("regexp1") String regexp1) {
        return "URI Part : " + regexp1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        int[] vis = new int[26];
        for(int i = 0; i < s.length(); i++){
            vis[s.charAt(i) - 'a']++;
        }
        int[] stackCount = new int[26];
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(stackCount[ch - 'a'] == 0){
                while(!stk.empty() && ch < stk.peek() && vis[stk.peek()  - 'a'] > 0){
                    stackCount[stk.pop() - 'a']--;
                }
                stackCount[ch - 'a']++;
                stk.push(ch);
            }
            vis[ch - 'a'] --;
        }
        StringBuilder res = new StringBuilder();

        for(char ch: stk){
            res.append(ch);
        }
        System.out.println(res);
    }
}
