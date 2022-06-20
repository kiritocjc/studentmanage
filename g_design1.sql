/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : localhost:3306
 Source Schema         : g_design1

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 15/05/2021 14:19:58
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for s_admin
-- ----------------------------
DROP TABLE IF EXISTS `s_admin`;
CREATE TABLE `s_admin`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of s_admin
-- ----------------------------
INSERT INTO `s_admin` VALUES (1, 'admin', '123456');

-- ----------------------------
-- Table structure for s_student
-- ----------------------------
DROP TABLE IF EXISTS `s_student`;
CREATE TABLE `s_student`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `studentId` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 36 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of s_student
-- ----------------------------
INSERT INTO `s_student` VALUES (42, 'xueshengzhanghao', '123456', '20210514');

-- ----------------------------
-- Table structure for s_teacher
-- ----------------------------
DROP TABLE IF EXISTS `s_teacher`;
CREATE TABLE `s_teacher`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `teacherId` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 23 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of s_teacher
-- ----------------------------
INSERT INTO `s_teacher` VALUES (1, '张三', '1', '1');
INSERT INTO `s_teacher` VALUES (8, '222', '1', '111');
INSERT INTO `s_teacher` VALUES (9, '李四', '1', '12345678');

-- ----------------------------
-- Table structure for studentinfo
-- ----------------------------
DROP TABLE IF EXISTS `studentinfo`;
CREATE TABLE `studentinfo`  (
  `studentId` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int(0) NULL DEFAULT NULL,
  `teacherId` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `grade` int(0) NULL DEFAULT NULL,
  `clazz` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `titleId` int(0) NULL DEFAULT 0,
  `src` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`studentId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of studentinfo
-- ----------------------------
INSERT INTO `studentinfo` VALUES ('20210514', '李小璐', '0', 22, '1', 2021, '计算机', 1, '说明.txt');

-- ----------------------------
-- Table structure for teacherinfo
-- ----------------------------
DROP TABLE IF EXISTS `teacherinfo`;
CREATE TABLE `teacherinfo`  (
  `teacherId` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `tname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `tage` int(0) NULL DEFAULT NULL,
  `tsex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `tdept` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `tel` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `QQ` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `professional` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`teacherId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of teacherinfo
-- ----------------------------
INSERT INTO `teacherinfo` VALUES ('1', '王老师', 23, '女', '计算机', '1212', '121', '教授');
INSERT INTO `teacherinfo` VALUES ('10', '小红', 23, '女', '计算机', '1', '1', '教授');
INSERT INTO `teacherinfo` VALUES ('11', '小红', 23, '女', '计算机', '1', '1', '教授');
INSERT INTO `teacherinfo` VALUES ('12', '小红', 23, '女', '计算机', '1', '1', '教授');
INSERT INTO `teacherinfo` VALUES ('13', '小红', 23, '女', '计算机', '1', '1', '教授');
INSERT INTO `teacherinfo` VALUES ('14', '小红', 23, '女', '计算机', '1', '1', '教授');
INSERT INTO `teacherinfo` VALUES ('15', '1', 23, '女', '计算机', '1', '1', '副教授');
INSERT INTO `teacherinfo` VALUES ('20210514', '张三丰', 56, '1', '研发部', '1354545455', '123123', '教授');
INSERT INTO `teacherinfo` VALUES ('3', '王五', 32, '男', '计算机', '1212', '121', '讲师');
INSERT INTO `teacherinfo` VALUES ('5', '小红', 23, '女', '计算机', '1', '1', '教授');
INSERT INTO `teacherinfo` VALUES ('6', '小红', 23, '女', '计算机', '1', '1', '教授');
INSERT INTO `teacherinfo` VALUES ('7', '小红', 23, '女', '计算机', '1', '1', '教授');

-- ----------------------------
-- Table structure for titleinfo
-- ----------------------------
DROP TABLE IF EXISTS `titleinfo`;
CREATE TABLE `titleinfo`  (
  `titleId` int(0) NOT NULL AUTO_INCREMENT,
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `teacherId` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `src` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`titleId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of titleinfo
-- ----------------------------
INSERT INTO `titleinfo` VALUES (1, '开发', '火车票销售系统', '1', NULL);
INSERT INTO `titleinfo` VALUES (2, '设计', '原型设计方案', '1', NULL);
INSERT INTO `titleinfo` VALUES (3, '开发', '系统开发方式', '1', NULL);
INSERT INTO `titleinfo` VALUES (4, '开发', '数据库优化', '1', NULL);
INSERT INTO `titleinfo` VALUES (5, 'mysql', '如何高并发写库', '1', NULL);

SET FOREIGN_KEY_CHECKS = 1;
