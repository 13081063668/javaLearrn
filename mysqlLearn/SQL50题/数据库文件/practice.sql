/*
 Navicat Premium Data Transfer

 Source Server         : root
 Source Server Type    : MySQL
 Source Server Version : 80029
 Source Host           : localhost:3306
 Source Schema         : practice

 Target Server Type    : MySQL
 Target Server Version : 80029
 File Encoding         : 65001

 Date: 01/07/2022 09:11:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `c_id` int(0) NOT NULL COMMENT '课程编号',
  `c_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '课程名称',
  `t_id` int(0) NOT NULL COMMENT '教师编号',
  PRIMARY KEY (`c_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES (1, '语文', 2);
INSERT INTO `course` VALUES (2, '数学', 1);
INSERT INTO `course` VALUES (3, '英语', 3);

-- ----------------------------
-- Table structure for score
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `s_id` int(0) NOT NULL COMMENT '学生编号',
  `c_id` int(0) NOT NULL COMMENT '课程编号',
  `s_score` int(0) NOT NULL COMMENT '分数',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of score
-- ----------------------------
INSERT INTO `score` VALUES (1, 1, 1, 80);
INSERT INTO `score` VALUES (2, 1, 2, 90);
INSERT INTO `score` VALUES (3, 1, 3, 99);
INSERT INTO `score` VALUES (4, 2, 1, 70);
INSERT INTO `score` VALUES (5, 2, 2, 60);
INSERT INTO `score` VALUES (6, 2, 3, 80);
INSERT INTO `score` VALUES (7, 3, 1, 80);
INSERT INTO `score` VALUES (8, 3, 2, 80);
INSERT INTO `score` VALUES (9, 3, 3, 80);
INSERT INTO `score` VALUES (10, 4, 1, 50);
INSERT INTO `score` VALUES (11, 4, 2, 30);
INSERT INTO `score` VALUES (12, 4, 3, 20);
INSERT INTO `score` VALUES (13, 5, 1, 76);
INSERT INTO `score` VALUES (14, 5, 2, 87);
INSERT INTO `score` VALUES (15, 6, 1, 31);
INSERT INTO `score` VALUES (16, 6, 2, 34);
INSERT INTO `score` VALUES (17, 7, 2, 89);
INSERT INTO `score` VALUES (18, 7, 3, 98);

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `s_id` int(0) NOT NULL COMMENT '学生编号',
  `s_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '课程名称',
  `s_birth` date NOT NULL COMMENT '出生年月',
  `s_sex` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '学生性别',
  PRIMARY KEY (`s_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, '赵雷', '1990-01-01', '男');
INSERT INTO `student` VALUES (2, '钱电', '1990-12-21', '男');
INSERT INTO `student` VALUES (3, '孙风', '1990-05-20', '男');
INSERT INTO `student` VALUES (4, '李云', '1990-08-06', '男');
INSERT INTO `student` VALUES (5, '周梅', '1991-12-01', '女');
INSERT INTO `student` VALUES (6, '吴兰', '1992-03-01', '女');
INSERT INTO `student` VALUES (7, '郑竹', '1989-07-01', '女');
INSERT INTO `student` VALUES (8, '王菊', '1990-01-20', '女');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`  (
  `t_id` int(0) NOT NULL COMMENT '教师编号',
  `t_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '教师姓名',
  PRIMARY KEY (`t_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES (1, '张三');
INSERT INTO `teacher` VALUES (2, '李四');
INSERT INTO `teacher` VALUES (3, '王五');

SET FOREIGN_KEY_CHECKS = 1;
